# Type Mismatch Error in Scala: Adding Int to Custom Class
This example demonstrates a common type mismatch error in Scala when working with custom classes.  The `add` method in `MyClass` is designed to accept another `MyClass` object.  Attempting to directly add an `Int` will result in a compilation error because the types are not compatible.  The solution involves either modifying the `add` method to handle `Int` inputs or creating a separate method for adding integers.

**Bug:**
Attempting to call the `add` method with an `Int` instead of a `MyClass` object will produce a compilation error.

**Solution:**
Modifying the `add` method to handle both `MyClass` and `Int` inputs or creating a separate method for handling integer addition will resolve this issue.
