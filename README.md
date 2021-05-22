# MySQLAPI


## Usage

### Connecting

#### Example
```java
MySQL = new MySQL();

mySQL.setUser(user);
mySQL.setHost(host);
mySQL.setPassword(password);
mySQL.setDb(database);
mySQL.setPort(3306); // default: 3306
```

### Creating a table

#### Example

```java
mysql.table("`table` (`column1` TEXT NOT NULL, `column2` TEXT NOT NULL)");
// you don't need CREATE TABLE IF NOT EXISTS, because its there default
```

### Getting Data

#### Example

```java
// USAGE: MySQL#getData(from, filter, where, Consumer)

mySQL.getData("from", "*", "`owner` = `XNonymous`", data -> {
   for (Row object : data.getObjects()) {
        // do whatever you want
        String owner = (String) object.get("owner");
   }
});
```

### Inserting Data

#### Example

```java
// USAGE: MySQL#insertData(table, values, data...)

mySQL.insertData("table", "`name`, `nameID`", "XNonymous", "#125432");
```

### Deleting Data

#### Example

```java
// USAGE: mySQL.delete(table, value, column) OR mySQL.delete(table, Delete.of(value, column)...)

mySQL.delete("table", "user", "XNonymous");
mySQL.delete("table", Delete.of("user", "XNonymous"), Delete.of("userID", "#125432"));
```
