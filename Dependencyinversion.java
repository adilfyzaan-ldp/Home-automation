package com.company;
class Mymessage{
    Decryptmessage dec= new Decryptmessage();

    void sendmessage(){
        System.out.println("The message sent to the user is"+ (dec.decrypt("helloworld")));
    }
}
class Decryptmessage{
    int decrypt(String msg ){
        System.out.println("The decrypted message is"+ Integer.parseInt(msg));
        return Integer.parseInt(msg);

    }
}

public class Dependencyinversion {

    public static void main(String[] args) {
	// write your code here
        Mymessage mymsg= new Mymessage();
        mymsg.sendmessage();

    }
}
