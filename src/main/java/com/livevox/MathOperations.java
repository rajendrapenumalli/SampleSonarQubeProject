package com.livevox;

public class MathOperations {
    public int add(int a,int b){
          return (a+b);
    }

    public int multi(int a,int b){
        return (a*b);
  }
    
    public int sub(int a,int b){
        return (a-b);
  }
    
    public int div(int a,int b){
        return (a/b);
  }    

  public String numberCompare(int a,int b){
	String result="na";
	if(a==b){
		System.out.println("Eequals to");
		result="eq";
	}
	if(a>b){
		result="gt";
	}
	if(a<b){

		result="lt";
	}

        
	return result;
  }  

}
