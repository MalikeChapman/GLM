1.  A grocery list consists of items the users want to buy at a grocery store. The application must allow users to add items to a list, delete items from a list, and change the quantity of items in the list (e.g., change from one to two pounds of apples). 
     --To implement the requirement, we need to create a class called ItemsList that can have all items selected by one user. Then we can use the following methods to allow users to add items to a list, delete items from a list, and change the quantify. addItem(), deleteItem(), changeQuantity()

2.  The application must contain a database (DB) of items and corresponding item types. 
     --To implement the requirement, we need to create a class called Item which can have all items available in store. Then we can use the following methods, addPrice(), changePrice()

3.  Users must be able to add items to a list by picking them from a hierarchical list, where the first level is the item type (e.g., cereal), and the second level is the name of the actual item (e.g., shredded wheat). After adding an item, users must be able to specify a quantity for that item. 
     --This is a relation between User and Item class. To implement the requirement, we need to create a class called User. Relationship needs to be added for Item and User. We can use the following methods, addUser(), changeUser(), modifyUser()

4.  Users must also be able to specify an item by typing its name. In this case, the application must look in its DB for items with similar names and ask the users, for each of them, whether that is the item they intended to add. If a match cannot be found, the application must ask the user to select a type for the item and then save the new item, together with its type, in its DB. 
     --This requirement is not fully related to our design

5.  Lists must be saved automatically and immediately after they are modified. 
     --This requirement has been saving into the ItemList(Requirement 1)

6.  Users must be able to check off items in a list (without deleting them). 
      --To implement this requirement, we need to create a class called checkOffItems which can have all check-off items selected by User and currently under ItemList. And we can use the method, addCheckOff()

7.  Users must also be able to clear all the check-off marks in a list at once. 
    --To implement this requirement, in checkOffItems class, we need to add a new method clearCheckOff()

8.  Check-off marks for a list are persistent and must also be saved immediately. 
    --This requirement has been saving into the checkOffItems class(Requirement 6)

9.  The application must present the items in a list grouped by type, so as to allow users to shop for a specific type of product at once (i.e., without having to go back and forth between aisles). 
    --This requirement asks us to categories the items by its type.To implement this requirement, we need to create a class called ItemType that can have multiple items in it. Then we can use the following methods, addCategory(), removeCategory()

10. The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly farmer’s market list”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete lists. 
    --This is a relation between User and ItemsList class.

11. The User Interface (UI) must be intuitive and responsive. 
     --This is an application UI requirement that we do not need to consider it.


