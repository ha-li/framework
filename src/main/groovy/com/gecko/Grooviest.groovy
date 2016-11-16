#!/Users/hlieu/groovy/groovy
package com.gecko

@Grab('commons-lang:commons-lang:2.4')
import org.apache.commons.lang.ClassUtils

assert(true);
assert 1 == 1;
assert(1==1);

def a = 5;
def b = 9;
//assert a==b;

Book sexyBook = new Book('Groovy in Action');

assert sexyBook.getTitle() == 'Groovy in Action';

// this calls a method before it is declared
assert getTitleBackwards(sexyBook) == 'noitcA ni yvoorG';


// showing that source code is fully compiled
// before it is executed
String getTitleBackwards(Book book) {
    String title = book.getTitle();
    return title.reverse();
}

// also, in here we use the Book class without
Pot pot = new Pot();
pot.setBrand("Celphalon");
System.out.println(pot.getBrand());




// we can also use pot here
def pot1 = new Pot();
pot1.setBrand('Monkey Brand');
System.out.println(pot1.getBrand());
assert pot1.brand == 'Monkey Brand';

def gina = new FixedBook('Groovy in Action');
assert gina.title == 'Groovy in Action'

def regina = new FixedBook(title:'Groovy in Action');
assert gina == regina

try {
    gina.title = "Oops!"
    assert false, 'should not reach here'
} catch (ReadOnlyPropertyException e) {
    println "Expected Error: $e.message";
}



assert !ClassUtils.isInnerClass(OutScript);
assert ClassUtils.isInnerClass(OutScript.InnerScript);

[1,2,3].each { entry -> System.out.println("printing " + entry); }

int sum = 0;
int product = 1;
[1,2,3].each { key -> sum += key;  product *= key; }
System.out.println("sum is " + sum);
System.out.println("prod is " + product);

def abc = "abcd";
def c = "b";
System.out.println (abc - c);
