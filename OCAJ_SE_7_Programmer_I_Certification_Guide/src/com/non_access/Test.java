package com.non_access;

interface MyInterface {}
class MyClass1 implements MyInterface {}
class MyClass2 implements MyInterface {}
class Test {
MyInterface[] interfaceArray = new MyInterface[]{new MyClass1(),null,new MyClass2()};
}