# LibraryCaseStudy

A library has books and each book has unique id and quantity. Library Members can borrow
only one book from the library and they must return the book within a week&#39;s time.
The library policies are as follows:
• If the return date is beyond 7 days, Rs.10 is charged as fine for each extra day.
• If the return date is beyond a month then Rs.50 is charged for each subsequent day after a
month. For every subsequent month, 50 * number of months is added for each extra day.
• At the start of every month a bill is produced for all members with a token amount of Rs.100 to
mark the continuance of the membership. In cases where the fine is applicable, the fine amount
is also added.
Write Java classes to implement this application. The code must be able to take inputs to create
books, members, dates (issue and return) and print the bill at the end of every month.
