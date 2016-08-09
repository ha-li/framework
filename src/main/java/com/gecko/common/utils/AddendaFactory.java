package com.gecko.common.utils;

import com.gecko.addenda.ReturnAddenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by DevAdmin on 8/5/2016.
 */
public class AddendaFactory {
    private AddendaFactory() {}
    private static Class<? extends ReturnAddenda> instanceClass = ReturnAddenda.class;

    public static void setInstanceClass(Class<? extends ReturnAddenda> instanceClass) {
        AddendaFactory.instanceClass = instanceClass;
    }

    public static ReturnAddenda createInstance(String data){
        try {
            Class[] argsClass = new Class[]{String.class};
            Object[] args = new Object[]{data};
            Constructor constructor = instanceClass.getConstructor(argsClass);
            return (ReturnAddenda) constructor.newInstance(args);
        } catch (NoSuchMethodException nsme) {
            nsme.printStackTrace();
        } catch(InstantiationException ie) {
            ie.printStackTrace();
        } catch (IllegalAccessException iae) {
            iae.printStackTrace();
        } catch (InvocationTargetException ite) {
            ite.printStackTrace();
        }
        return null;
    }


}
