# richfaces-webapp-archetype
Automatically exported from code.google.com/p/richfaces-webapp-archetype

This is a *[Maven](http://maven.apache.org/)* archetype to easily get a working *[RichFaces](http://www.jboss.org/richfaces)* project mainly under *[Netbeans](http://www.netbeans.org)*. Besides I will include some thing what might be useful to have as an example.

But this archetype does not depend on NetBeans so much. You can use it also without NetBeans. 

Since *javax.faces.DEFAULT_SUFFIX* in web.xml is set to .xhtml you can not use .jspx or .jsp file extensions but you have *[Facelets](http://facelets.dev.java.net/)* support.
If you change *javax.faces.DEFAULT_SUFFIX* to .jspx you will have it.

# Usage
## Usage from NetBeans
  * Checkout this project with Netbeans.
  * Allow Netbeans to open this project after checkout.
  * Right Click on the Project and Build.
  * If you are using Netbeans, you can now create a new Maven project using the newly available type called "RichFaces WebApp Archetype".
    * If this is not available you should update the local maven repository index. From Netbeans menu select "Window -> Other -> Maven Repository Browser". Right click on "Local Repository" and select "Update Index".
  * Run the newly created project and you should get an example webpage which can use IceFaces.

# Shows an Example of
## Internationalization via properties file


See also [icefaces-webapp-archetype](https://github.com/tamastarjanyi/richfaces-webapp-archetype) twin project if you are interested.
