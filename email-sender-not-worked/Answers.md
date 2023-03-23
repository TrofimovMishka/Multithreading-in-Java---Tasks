<h3 style="color:green">В чем отличие TreeMap и HashMap?</h3>
<h4>HashMap</h4> -> Store key-value pair. Unordered. Inside Array with backed. Need to calculate hashCode to find place where store and where get the pair. Backed is a LinkedList of 8 elements, after that transform to binary tree.

<h4>TreeMap</h4> -> Store key-value in Sorted Ascending order. Inside Red-Black tree.

<h3 style="color:green">Зачем нужно писать в таком коде ArrayList< ? ></h3>
Can be used if you want to create a method that will take any type of ArrayList and do some action.
For instance method to print all elements from list. < ? > - means any type

<h3 style="color:green">Какие бывают внутренние классы?</h3>
The Java have: <code>Inner Class, Local Inner Class, Anonymous Inner Class and Static Inner Class(Nested)</code>

<h3 style="color:green">Во что компилируется анонимный внутренний класс?</h3>
The compiler create unnamed class that implement interface and create a one object of this class

<h3 style="color:green">Зачем использовать ключевое слово final при создании анонимных классов?</h3>
If we use <code>final</code> keyword that means we can't change the reference to instance of anonymous class.
It is care our instance.

<h3 style="color:green">Как правильно создать объект внутреннего класса?</h3>
For this we must use object of outer class. Ex:<br>
<code>
OuterClass outer = new OuterClass();<br>
OuterClass.InnerClass inner = outer.new InnerClass();<br>
inner.printOuterClassVar();<br>
</code>

<h3 style="color:green">Как правильно создать объект вложенного класса?</h3>
We should use full path name ex:<br>
<code>
OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();<br>
staticClass.printVar();<br>
</code>

<h3 style="color:green">Можно ли создавать статические методы/переменные во внутреннем классе?</h3>
Before JDK16 - No. After JDK16 - Yes
