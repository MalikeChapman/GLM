### Design Information
## By _Yaohui Chen_

1) A grocery list consists of items the users want to buy at a grocery store. The application must allow users to add items to a list, delete items from a list, and change the quantity
of items in the list (e.g., change from one to two pounds of apples).

    _To realize the requirement, I added a class ItemsList with attributes Item_ID and Quantity. The class ItemsList has operations which is 
    addItem(itemName)
    deleteItem(itemName)
    changeQuantity(itemName)
    selectItemsForCheckOff(itemName)
    clearCheckOffMarks()_

2) The application must contain a database (DB) of items and corresponding item types.

    _Implemented but not modeled as its not part of UML guidelines, a database of items._


3) Users must be able to add items to a list by picking them from a hierarchical list, where
the first level is the item type (e.g., cereal), and the second level is the name of the
actual item (e.g., shredded wheat). After adding an item, users must be able to specify a
quantity for that item.

    _When the user goes to use the addItem method, there is a class called ItemTypeSet that has a list of predefined itemType in which the user can choose from, at which point there's another class called ItemType that handles the creation of items as objects._


4) Users must also be able to specify an item by typing its name. In this case, the
application must look in its DB for items with similar names and ask the users, for each
of them, whether that is the item they intended to add. If a match cannot be found, the
application must ask the user to select a type for the item and then save the new item,
together with its type, in its DB.

    _Not fully displayed as it's a UI feature more than a UML but in the listView class there is a method called SearchItems in which a user can search for a item by directly querying the database across multiple lists which is handled by the rearchItems method. The addItemType method also lets users add item types to be used when creating new items in the ItemTypeSet class._


5) Lists must be saved automatically and immediately after they are modified.

    _Once a Item is created, the ItemsList class will immediately update the database as the CRUD for items in the DB line illustrates._


6) Users must be able to check off items in a list (without deleting them).

    _Each object of an Item class has an attribute of type boolean that will identify whether its checked off or not as per the isCheckedOff attribute._


7) Users must also be able to clear all the check-off marks in a list at once.

    _There is a method in ItemsList class that is responsible for obtaining all items in the DB pertaining to the list by identifying every item that shares the value of belongingList attribute in each Item object and resets their boolean value of isCheckedOff to false._


8) Check-off marks for a list are persistent and must also be saved immediately.

    _isCheckedOff attribute in the Item class is saved and carried with the object to the database as soon as the object is finished being edited via the CRUD for items in DB connection._


9) The application must present the items in a list grouped by type, so as to allow users to
shop for a specific type of product at once (i.e., without having to go back and forth
between aisles).

    _Since this is a UI element, it won't fully reflect in the UML but each Item object has a itemType attribute that is saved with the item thus making each item to be grouped by their item type when needed._


10) The application must support multiple lists at a time (e.g., “weekly grocery list”, “monthly farmer’s market list”). Therefore, the application must provide the users with the ability to create, (re)name, select, and delete lists.

    _To realize the requirement, I added a class ListView with attributes List_ID and List_Name. The class ListView has operations which is 
    createList(listName), 
    renameList(selectList, newListName),
    deleteList(listName)_

11) The User Interface (UI) must be intuitive and responsive.

    _Not displayed or modeled in the UML as it's a UI element, thus it is not considered._

