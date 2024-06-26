import sys

class Graph():
    def __init__(self,vertices):
        self.V=vertices;
        self.graph=[[0 for coulmn in range(vertices)]for row in range(vertices)]
    
    def minKey(self,key,mstSet):
        min=sys.maxsize
        for v in range(self.V):
            if(key[v]<min and mstSet[v]==False):
                min=key[v]
                min_index=v
        
        return min_index
    
    def printMst(self,parent):
        print("Edge \t Weight")
        for i in range(1,self.V):
            print(parent[i],"-",i,"\t",self.graph[i][parent[i]])
    def primMst(self):
        
        mstSet=[False]*self.V
        key=[sys.maxsize]*self.V
        parent=[None]*self.V
        
        key[0]=0
        parent[0]=-1   #type:ignore
        
        for u in range(self.V):
            u=self.minKey(key,mstSet)
            mstSet[u]=True
            
            for v in range(self.V):
                if(self.graph[u][v]>0 and mstSet[v]==False and key[v]>self.graph[u][v]):
                    key[v]=self.graph[u][v]
                    parent[v]=u  #type:ignore
            
        self.printMst(parent)
        
        
if __name__=='__main__':
    
    g=Graph(5)
    g.graph= [[0, 2, 0, 6, 0],
               [2, 0, 3, 8, 5],
               [0, 3, 0, 0, 7],
               [6, 8, 0, 0, 9],
               [0, 5, 7, 9, 0]]
    
    g.primMst()
    
    
                    
        
        
        