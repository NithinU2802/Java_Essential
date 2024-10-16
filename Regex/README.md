    A Regular Expression or Regex is a special sequence of characters
that help in matching or finding other strings or set of strings using a
specialized syntax.

    The Regex API provides the necessary classes and interfaces for working
with regular expressions. String class uses this API to support regex by
following methods - matches(), split(), replaceFirst() and replaceAll()

    - matches() will return true where it compares regex string with actual
string value.
    - split() will return array of string on the basis of regular expression
based on mentioned argument.

    To generalized regular expression we required the help of following:
        - Literals
        - Meta Characters
        - Quantifiers
        Eg: Hello.*    where Hello is literals, Meta Character is . and * is
the quantifiers.

Meta Characters:
[] - To match a single character that contained within the bracket. '-' for range.
.  - Matches any single character except new line.
[^] - Matches single character thaat is not within the bracket.
| - "Or" expresiion to match alternatives
() - Grouping the expressions to form sub-expressions.
\n - Matches the nth captured sub-expression group.

Quantifiers:
? - Matches the preceding element zero or one times.
* - Matches the preceding element zero or one times.
+ - Matches the preceding element one or more times.
{m} - Matches the preceding element exactly m times.
{m,} - Matches the preceding element m or more times.
{m,n} - Matches the preceding element m and maximum of n times.

Predefined class:
\w - Alphanumeric characters and the underscore.
|w - Non-word characters
\d - Digits
\D - Non-digits
\s - Whitespace characters
\S - Non-whitespace characters