# This is a design for a grocery list app

#####  User:
- the user starts by searching for an item and adds it to a list
- ###### User uses Grocery List

#### Grocery List:
- in here, items are stored as a string of items

- the user can add items, with their desired quantity in whatever list they choose
- the user can also delete an item from whatever list they want
- and they have the option of modify the quantity they want
- ###### Grocery List is a List
- ###### Grocery List consists of Items

##### Lists: 
- the user has a bunch of options here. The list is grouped according to the items' types.

- The user can check off an item, create a new list, select an existing list, or even delete it.

##### CheckOffItems:
- the user has the option to check of an item without deleting it
- they also have the option to clear the check mark from all checked items

- ###### Lists has Check Off Items

##### Items:
- items are saved as a string 
- if the user inputs/ searches for a new item, the system will save it as a new item, using ItemType

- ###### Items uses ItemType

##### ItemType:
- saves item types as string to categorize the products for the user

- checks if an item exits, if not it saves it as a new item






