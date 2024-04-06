class Graph():
    
    def __init__(self,vertices):
        self.V=vertices
        self.graph=[]
    
    def addEdge(self,u,v,w):
        self.graph.append([u,v,w])
        
    def find(self,parent,i):
        if(parent[i]!=i):
            parent[i]=self.find(parent,parent[i])
        return parent[i]
    
    def union(self,parent,rank,x,y):
        if rank[x]<rank[y]:
            parent[x]=y
        elif rank[x]>rank[y]:
            parent[y]=x
        else:
            parent[y]=x
            x=x+1
            
    def kruskalMst(self):
        result=[]
        parent=[]
        rank=[]
        i=0
        e=0
        
        self.graph=sorted(self.graph,key=lambda item:item[2])
        
        for node in range(self.V):
            parent.append(node)
            rank.append(0)
        
        while e < self.V-1:
            
            u,v,w=self.graph[i]
            i=i+1
            x=self.find(parent,u)
            y=self.find(parent,v)
            
            if x!=y:
                e=e+1
                result.append([u,v,w])
                self.union(parent,rank,x,y)
        
        minCost=0
        print("Following are the edges in the constructed MST")
        for u,v,w in result:
            minCost=minCost+w
            print(f"{u}-->{v}=={w}")
        print(f"Minimum Cost Spanning Tree:{minCost}")
            


if __name__=="__main__":
    g=Graph(4)
    g.addEdge(0, 1, 10) 
    g.addEdge(0, 2, 6) 
    g.addEdge(0, 3, 5) 
    g.addEdge(1, 3, 15) 
    g.addEdge(2, 3, 4) 
    
    g.kruskalMst()
    
            
            
        
        