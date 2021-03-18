Design-Information
==================

This document is to explain the design requirements for the Grocery List
Manager.
We will be going over what was implemented into the design and what was
left out in the class diagram.
If you have any other questions, please don't hesitate to contact us at
*TheDesignTeamIsAwesome.org*.

1.  A grocery list consists of items the users want to buy at a grocery
    store. The application
    must allow users to add items to a list, delete items from a list,
    and change the quantity
    of items in the list (e.g., change from one to two pounds of
    apples).
    For this, we created a new class called users with several
    attributes and operations.
    The first operation we gave is to add items to a list, delete items
    from a list, or change the quantity of items in a list.

2.  The application must contain a database (DB) of items and
    corresponding item types.
    In the diagram we created a new class called items that lists the
    type of items that are available.

3.  Users must be able to add items to a list by picking them from a
    hierarchical list, where
    the first level is the item type (e.g., cereal), and the second
    level is the name of the
    actual item (e.g., shredded wheat). After adding an item, users must
    be able to specify a
    quantity for that item.
    For this we implemented some inheritance by adding additional
    claases FoodItem and NonFoodItem.
    With these two classes we also added different children of these
    classes that represent different types of food.

4.  Users must also be able to specify an item by typing its name. In
    this case, the
    application must look in its DB for items with similar names and ask
    the users, for each
    of them, whether that is the item they intended to add. If a match
    cannot be found, the
    application must ask the user to select a type for the item and then
    save the new item,
    together with its type, in its DB.
    For this, we implemented an operation named searchItem. This
    operation allows users to search
    for an item. If the name matches a name from the item in the
    database, all items with that name will be brought
    in the results. We didn't implement the match not found, instead we
    will display this item is not within the
    store to the user.

5.  Lists must be saved automatically and immediately after they are
    modified.
    For this, we added an operation to both the GroceryList and Userlist
    classes that when any modificaiton
    was done to an item in the list, we will automatically notify the
    list to save the changes. With this
    we prevent lists from having errors due to items not properly
    saving.

6.  Users must be able to check off items in a list (without deleting
    them).
    We gave each item an attribute that tracks whether it has been
    checked or not. This attribute is called
    itemCheck and it will be how we keep track of what items are
    currently selected by the user.

7.  Users must also be able to clear all the check-off marks in a list
    at once.
    In order to apply this, we created a operation called
    clearAllCheckedItems. This operation will search the
    entire list if there are checked items and for each one, we will
    uncheck it until all are unchecked. This
    operation ties into the checked attribute we developed earlier.

8.  Check-off marks for a list are persistent and must also be saved
    immediately.
    Just like we have itemCheck to tell us if a item is checked. We also
    have an attribute called
    listCheck that notifies the user if the user selected a list.

9.  The application must present the items in a list grouped by type, so
    as to allow users to
    shop for a specific type of product at once (i.e., without having to
    go back and forth
    between aisles).
    Each item classes has a list that keeps track of all items of that
    group type. Meats will be with
    meats, cleaning supplies will be with cleaning supplies, so you
    won't have to waste time going
    around looking for items that should be grouped together.

10. The application must support multiple lists at a time (e.g., “weekly
    grocery list”, “monthly
    farmer’s market list”). Therefore, the application must provide the
    users with the ability to
    create, (re)name, select, and delete lists.
    We created a class called UserLists who's main and only purpose is
    to keep track of the amount of lists
    each user currently has. This class has operations that will allow
    users to delete not only the current list
    but all lists. Users can also create, select, or rename the lists in
    there.

11. The User Interface (UI) must be intuitive and responsive.
    Well this is hard to due, if not impossible at this moment. Trial
    and error for this. We will be constantly
    modifying this to your expectations.


