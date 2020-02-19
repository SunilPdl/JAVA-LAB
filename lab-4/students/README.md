# Exception handiling:


An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e
 at run time, that disrupts the normal flow of the program’s instructions.
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that
 normal flow of the application can be maintained.


There are two types of exception:

* Unchecked Exception

The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at
 compile-time, but they are checked at runtime.

* Checked Exception

The classes which directly inherit Throwable class except RuntimeException and Error are known as
 checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.


Java exception handiling is managed via five keywords
such as try,catch,throw,throws and finally.
### Try
The codes which may cause exception are checked
in this block.
	- If the code do cause exception it throws the exception to catch blocks
	- If the code doesnot cause exception it does nothing

### catch

 The exception thrown by the try block is catched by this block and checks the exception type

### finally

The code inside this block is executed no matter what, even when the method returns some values

### throw

- It throw's a specific exception manually

### throws

- It throw's multiple excpetions manually
- It is written besides the method defination
- If a method with throws exception is 




# Java Package

A java package is a group of similar types of classes, interfaces and sub-packages.
Package in java can be categorized in two form, built-in package and user-defined package.
There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.


* Preventing naming conflicts. For example there can be two classes with name Employee in two packages,
  college.staff.cse.Employee and college.staff.ee.Employee

* Making searching/locating and usage of classes, interfaces, enumerations and annotations easier

* Packages can be considered as data encapsulation (or data-hiding).
