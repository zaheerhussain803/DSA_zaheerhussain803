class Hardeep{
    
    public Static void main(String[]args){
        
        String s ="hello";
        for(int i=0;i<s.length;i++){
            
            for(int j=s.length-1;j>0;j--){
                int temp = s[i];
                s[i]=s[j];
                s[j]=temp;
                
            }
        }
        System.out.println(s);
    }
}