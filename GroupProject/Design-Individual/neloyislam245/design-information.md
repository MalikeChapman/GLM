1. A grocery list consists of items the users want to buy at a grocery store. The application 
must allow users to add items to a list, delete items from a list, and change the quantity
of items in the list (e.g., change from one to two pounds of apples).
-- This step tells me to create a class called ItemList with 3 different operations; AddItem(), 
RemoveItem() and ChangeQuantity().

2. The application must contain a database (DB) of ​items​ and corresponding ​item types​.
-- I created 2 different classes called Item & ItemType containing necessary attributes and operations.

3. Users must be able to add items to a list by picking them from a hierarchical list, where
the first level is the item type (e.g., cereal), and the second level is the name of the
actual item (e.g., shredded wheat). After adding an item, users must be able to specify a
quantity for that item.
-- Previously I created two different classes for identifying an item. Now I create a class called User
which contains the basic info of a user. When item is found and added to the ItemList class, user will 
be asked about the quantity.

4. Users must also be able to specify an item by typing its name. In this case, the
application must look in its DB for items with similar names and ask the users, for each
of them, whether that is the item they intended to add. If a match cannot be found, the
application must ask the user to select a type for the item and then save the new item,
together with its type, in its DB.
-- The User class will be using another class called SearchItem where an item will be looked for 
based on their ItemTypeName and ItemName. The rest of the directions will be done by the development team.

5. Lists must be saved automatically and immediately after they are modified.
-- This should be implemented using programming language in the ItemList class.

6. Users must be able to check off items in a list (without deleting them).
-- After an item is put in the ItemList class, that will be sent to the CheckOffItem class where there will
be an operation called AddCheckOff() which lets the user to check off any item from buying.

7. Users must also be able to clear all the check-off marks in a list at once.
-- There is another operation called ClearAllCheckOff() in the same class that check offs everything at once.

8. Check-off marks for a list are persistent and must also be saved immediately.
-- Should be done by the development team.

9. The application must present the items in a list grouped by type, so as to allow users to
shop for a specific type of product at once (i.e., without having to go back and forth
between aisles).
-- ItemType class has an operation called AddAnyItem() which should be remodeled by the programmer. This method
will add an item sequencially in the list. Next, when a user asks for an item in the Search class, it has two different
operations called SortByItemType() and SortByItem() which show the items by groups.

10. The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly
farmer’s market list”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete lists.
-- This requirement is a relationship between User and ItemList classes where one User will have multiple ItemsList. 
One User class instance will have multiple ItemList.

11. The User Interface (UI) must be intuitive and responsive.
-- Not considered because it does not affect the design directly.