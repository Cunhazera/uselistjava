# What is this?

Let's say you have a list with items and you want to separate it in groups from each letter.

Like this:

You have the item Gun and Sword.

G = Gun

S = Sword.

# About the solution

The main Java code of this project uses TreeMap with two params (key and value). Each key is a letter from the words from the list of items. And the value is it content.

So it's not necessary to create one List<String> for each letter from the Items. The TreeMap already sort it alphabetically and separate into groups.
