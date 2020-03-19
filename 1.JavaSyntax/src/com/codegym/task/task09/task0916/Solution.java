package com.codegym.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Catching checked exceptions

*/

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());

    }

    public static void handleExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RemoteException e){

        } catch (NoSuchFieldException e){

        } catch (IOException e){

        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
