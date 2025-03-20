public class add678 {
    public static void main(String[] args){
       for(int i=1;i<500;i+=2){
        int k=1;
        //System.out.println(i);
        k=i;
        int m=1;
        int jjh=1;
        int lol=0;
        while(k>0){
             m=k%10;
             
             lol=lol+m;

            if(m==0){
                jjh=0;
                break;
            }
            k=k/10;
            
        }
        if(jjh==1 && lol%2!=0){
            System.out.println(i);
        }
        
       } 
    }
}
