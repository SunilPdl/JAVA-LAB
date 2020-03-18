
 
## AWT ( abstract window toolkit)
- AWT contains large numbers of classes and methods that allows you to create and manage graphical user interface(GUI) such as windows, buttons, scrollbars,textblocks ,etc.
- The awt was designed to provide a common set of tools for GUI design that could work on a variety of platforms.  
- The tools provided by the awt are implemented using each platforms native GUI toolkit, hence preserving the look and feel of each platform. It is an advantage of awt. But the disadvantage of such an approach is that GUI designed on one platform may look different when displayed on another platform. 
- Awt is the foundation upon which swing is made. 


https://static.javatpoint.com/images/awthierarchy.jpg

# Checkbox
 - A ```Checkbox``` is a control that is used to turn an option on or off.
 - It consists of a small box tha can either contain a checkmark or not.
 - There is a ```Label``` associated with each check box that describes what option the box represents.
 - Can change the state of a ```Checkbox``` by clicking on it.

 ## Constructors:
  1. ```Checkbox() throws HeadlessException```
  2. ```Checkbox(String str) throws HeadlessException```
  3. ```Checkbox(String str, boolean on) throws HeadlessException```
  4. ```Checkbox(String str, boolean on, CheckboxGroup cbGroup) throws HeadlessException```
  5. ```Checkbox(String str, CheckboxGroup cbGroup, boolean on) throws HeadlessException```


 ## Methods 
  1. ```boolean getState();```
  2. ```void setState(boolean on);```
  3. ```String getLabel();```
  4. ```void setLabel(String str);```


# Labels
- Labels are passive controls that do not support any interaction with the user i.e. no event handling.
- A label is an object of type ```Label``` and it contains a String, which it displays.
- Label defines the following constructors:  
i. ```Label() throws HeadLessException```  
ii. ```Label(String str) throws HeadLessException``` // The string is left justified.  
iii. ```Label(String str, int how) throws HeadLessException``` // label.LEFT, label.RIGHT  

### Methods
i. ```void setText(String str);```  
ii. ```String getText();```  
iii. ```void setAlignment(int how);```  
iv. ```int getAlignment();```

# Scrollbar
  - ```Scrollbar``` is used to select continuous values between a specified minimum and maximum.
  - May be oriented horizontally or vertically.
  - It contain slider box that can be dragged by the uset to a new position.

  # Constructors
   1. ```Scrollbar() throws HeadlessException```
   2. ```Scrollbar(int style) throws HeadlessException```  
- Style includes ```Scrollbar.VERTICAL``` and ```Scrollbar.HORIZONTAL```. 

3. ```Scrollbar(int style, int thumbSize, int min, int max) throws HeadlessException```

  # Methods:
   1. ```void setValues(int initialValue, int thumbSize, int min, int max);```
   2. ```int getValue()```
   3. ```void setValue(int newValue)```
   4. ```int getMinimum()```
   5. ```int getMaximum()```

   # TextArea
  > Sub class of ```TextComponent```

  - Sometimes a single line of text input is not enough for a given task. To handle this situation, the awt includes a simple multiline editor called ```TextArea```.

  ## Constructors
   1. ```TextArea() throws HeadlessException```
   2. ```TextArea(int numLines, int numChars) throws HeadlessException```
   3. ```TextArea(String str) throws HeadlessException```
   4. ```TextArea(Stirng str, int numLines, numChars) throws HeadlessException```
   5. ```TextArea(String str, int numLines,int numChars, int sBars) throws HeadlessException```

   > Here, numLines represents rows and numChars represents number of columns. sBars is Scroll Bar to use scrollbar in the TextArea.

   ```SCROLLBARS_BOTH, SCROLLBARS_NONE, SCROLLBARS_HORIZONTAL_ONLY, SCROLLBARS_VERTICAL_ONLY```

  Public Methods:
   1. ```String getText()```
   2. ```void setText()```
   3. ```String getSelectedText()```
   4. ```void select(int startIndex, int endIndex)```
   5. ```boolean isEditable()```
   6. ```void setEditable( boolean canEdit)```

>  These methods are defined by ```TextComponent```  
> ```TextComponent``` class is the superclass of ```TextField``` and ```TextArea```  
> So, both ```TextField ```and ```TextArea``` can use these methods.
   
   TextArea adds the following editing methods:
   1. ```void append(String str)```
   - The ```append()``` method appends the strings specified by str to the end of the current text.

   2. ```void insert(String str , int index)```
   - ```insert()``` method inserts the string passed in str at the specified index.

   3. ```void replaceRange(String sr, int startIndex , int endIndex)```
   - To replace text, ```replaceRange()``` replaces the characters from startIndex to endIndex-1, with the replacement text passed in str.


# Example:

```java
import java.awt.*;  
class First extends Frame{  
First(){  
Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
add(b);//adding button into frame  
setSize(300,300);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
}  
public static void main(String args[]){  
First f=new First();  
}}  
```
```java
import java.awt.*;  
class First2{  
First2(){  
Frame f=new Frame();  
Button b=new Button("click me");  
b.setBounds(30,50,80,30);  
f.add(b);  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String args[]){  
First2 f=new First2();  
}}  
```
