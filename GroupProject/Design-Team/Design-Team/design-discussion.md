### Section A: Individual Designs

#### Design 1 (malikechapman):
---

![](https://github.com/qc-se-spring2021/370Spring21Sec55Team6/blob/main/GroupProject/Images/asherDesign.jpg)

Pros:

- The UML diagrams is clearly split into two sides. One side supports the lists, while the other sides supports the items. 
We can clearly see the items come from a database and from that, the item is separated into two distinct categories. 
The two categories foodItem and nonfooditem tells us that items won't be bunched together and that we will know where 
and how items will be separated. On the other side with the lists, we can see the clear hierarchy among the GroceryList 
and UserList. We also like how the itemCheck boolean values are used to identify which items are being selected by the 
user and which aren't

##### Cons:
- The UML is missing some important features. We don't see the itemType feature which is crucial for items. The way he 
tried to use foodItem and nonfooditem as the type doesn't really fill in for itemtype. We also didn't see the search 
class. A search class is very important to not only streamline the process of finding items, we also don't want 1 class 
to have too many things to do. The USER class does the bulk of everything and it shouldn't be that way. Some functions 
the user has should be in the search class. He also failed to add the multiplicities to his entities.


#### Design 2 (neloyislam245):

---
![](https://github.com/qc-se-spring2021/370Spring21Sec55Team6/blob/main/GroupProject/Images/neloyislam245Design.jpg)

##### - Pros: 

- Good thing about this diagram is it has a clear vision on it. If you look into it, its very easy to read and get 
the picture without even giving an explanation. It maintains a correct flow as it is supposed to be, User asks for an 
item, item is looked based on ItemType and Item, once the item is found, send it to the list class and finish the 
business.

##### Cons: 
- After reviewing others diagram, I see there are few wrong relationship indication in this diagram. I see few 
attributes are missing as well.This diagram has only few options where the whole picture could be a lot bigger.


#### Design 3 (ych529):
---
![](https://github.com/qc-se-spring2021/370Spring21Sec55Team6/blob/main/GroupProject/Images/ych529Design.jpg)

##### Pros:

- The UML diagram is clear and simple. We can clearly see the items created by type with the boolean isCheckedOff which is 
very convenient for clearing the Check-Off Mark. We can also create, read, update and delete items from the database of 
items. In the List, we are able to search for an item in the database.

##### Cons:
- The UML Diagram is missing and messing with some important features. The relationship is messing up and the multiplicities 
are missing. The Item type is many but not enough. Also, there is no user class and its relationships to show what users 
can do in the system.


#### Design 4 (zxy9889):
---

![](https://github.com/qc-se-spring2021/370Spring21Sec55Team6/blob/main/GroupProject/Images/zxy9889Design.jpg)

#### Pros:

The UML design can clearly see that how many classes we need to use, and for each class, what operations and 
function can be used to help implement our final goal.

##### Cons: 
-The UML misses some important information. I do not show the specific relationship among different classes. I 
also miss the Search class to help custom find the item.

#### Design 5 (noureensandresy): 
---
![](https://github.com/qc-se-spring2021/370Spring21Sec55Team6/blob/main/GroupProject/Images/noureensandresyDesign.jpg)

 #####  Pros: 

- The design is simple. We can see that the user has access to the grocery list. They can add, delete, and  change the quantity of whatever product they want. The system can also add the new product they searched for after specifying its type.

##### Cons:
- The arrows and connections between classes were a bit messed up. The user class was supposed to be connected to the list class instead of the grocerylist class. The user also was never given access to the items, so they can't really search for it unless they are in the grocerylist.

### Section B: Team Design
---
![](https://github.com/qc-se-spring2021/370Spring21Sec55Team6/blob/main/GroupProject/Images/teamDesign.jpg)



For the team design, we liked Asher's UML a lot. The way he separated UML into two sections made it easy to follow.  
We also liked Md and Noureen's designs.  We essentially combined decided to combine Asher's and Md's designs. With both 
of there designs combined, the cons that Asher had, Md's design made up for it. We added the itemSearch class from Md's 
design to Asher's class. Most designs followed a similar structure of mostly revolving around itemType and item being the 
main focus. We decided on this design since it fits with the requirements more. Having one itemtype class was not enough. 
We thought it would be better to further divide that into child classes to make it easier to group itemTypes that are the 
same. Since we have two ways of searching for items, having foodGroups of classes we can make lists that hold each item of 
that foodGroup. This will streamline how we find items.



### Section C: Summary
---
This Diagram is fully relied on the user and the item stored in database. Firstly, we start our operation from the
user class where we store the basic info of an user and gives the user the capability to search for an item. When item
is being searched, user can choose to search the item by typing its name or typing its type. ItemType is an attribute
of the Item class where it helps the search method for narrowing it down. If the desired item is found, we flagged it as
checkedItem method, otherwise it becomes false. Our Item class is linked to the Database. The Item is stored based on 
two different catagory, either FoodItem or NonFoodItem. People do care about the bestbuy date and the expire date of a 
food item so we have these attributes in the FoodItem class. Once the item is found, we can choose the quantity of that 
item and finalize that. We have the option to go back and select more items as we wish. Once the item list is completed, 
we send the list to the Lists class where we have options to tweak few thingg such as createList, deleteList, 
listModification etc. This final list will be stored in the GroceryList with a tag on it and in the UserList class as well
where it will be tagged with the user info whom purchased this with other attributes.