UserInputFields.kt
This is custom view code for the item being displayed in edittexts_item.xml.
A TextView heads the custom view with a category name for what goes into EditText fields.
View programmatically generates any number of EditText fields.

ListObject.kt
This model class holds a placeholder array used in testing and sets the number of items
in the recyclerView.

GetUserTexts.kt
This activity code starts the recyclerView adapter and set an intent to go to the
LastPage activty.

EditTextsRecyclerViewAdapter.kt
Takes the array of ListObjects, sets the title/category for the EditText fields.

activity_get_user_texts.xml
This is the activity that displays the recyclerView where user inputs the words they want
in the DevLib.

edittexts_item.xml
Item uses UserInputFields custom view inside of a cardView.

attrs_get_lib_words.xml
Holds attributes of UserInputFiels custom view.