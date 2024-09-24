package DesignPatterns.StructuralDesignPatterns.ProxyPattern;

import DesignPatterns.StructuralDesignPatterns.ProxyPattern.Exception.InvalidPassKeyException;

public class ProxyClass extends RealSubjectClass{
    @Override
    public void method(String passKey) {
        System.out.println("-------------------------PROXY CLASS-------------------------");
        System.out.println("Authenticating PassKey...");
        if(passKey.contains("jibin")){
            System.out.println("PassKey is Valid !!!");
            Credentials credentials = new Credentials();
            credentials.setPassKey(passKey);
            super.method(credentials.getPassKey());
        }else{
            throw new InvalidPassKeyException("PassKey is not Valid");
        }
    }
}
