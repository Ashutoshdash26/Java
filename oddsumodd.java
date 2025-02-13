class oddsumodd {
    public static void main(String []args){
        int i,j,fla,k,sum=0;
        for(i=1;i<5000;i++){
            fla=1;
            sum=0;
            j=i;
            while(j!=0){
                k=j%10;
                j=j/10;
                sum=sum+k;
                if(k%2==0){
                    fla=0;
                    break;
                }
                
            }
            if(sum%2!=0 && fla==1){
                System.out.println(i);
            }
        }
    }
}

