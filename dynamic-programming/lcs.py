class LCS():
    @staticmethod
    def calculateLCS(str1,str2,p,q):
        table=[[0 for _ in range(q+1)]for _ in range(p+1)]
        
        for i in range(1,p+1):
            for j in range(1,q+1):
                if str1[i-1]==str2[j-1]:
                    table[i][j]=1+table[i-1][j-1]
                else:
                    table[i][j]=max(table[i-1][j],table[i][j-1])
        
        
        index=table[p][q]
        temp=index
        
        lcslist=[""]*(index+1)
        lcslist[index]=""
        
        i,j=p,q
        
        while i>0 and j>0:
            if str1[i-1]==str2[j-1]:
                lcslist[index-1]=str1[i-1]
                i=i-1
                j=j-1
                index=index-1
            elif table[i-1][j]>table[i][j-1]:
                i=i-1
            else:
                j=j-1
        
        lcs="".join(lcslist[:temp+1])
        return lcs
                
            
    @staticmethod
    def main():
        str1=input("Enter the first string: ")
        str2=input("Enter the second string: ")
        p=len(str1)
        q=len(str2)
        
        lcs=LCS.calculateLCS(str1,str2,p,q)
        print(f"LCS: {lcs}")
        


if __name__=="__main__":
    LCS.main()