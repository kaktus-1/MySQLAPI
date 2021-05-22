# MySQLAPI


## Usage

Download the latest released Jar.
Import it to your project.

**OR**

Import it via Maven.

After it you have to connect first.

## Maven

Current version is the [latest released](https://github.com/XNonymous-N2/MySQLAPI/releases) tag.
```xml
<dependency>
    <groupId>com.github.xnonymous-n2</groupId>
    <artifactId>mysqlapi</artifactId>
    <version>VERSION</version>
</dependency>
```
```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

### Connecting

Port is optional.

#### Example
```java
MySQL mySQL = new MySQL();

mySQL.setUser(user);
mySQL.setHost(host);
mySQL.setPassword(password);
mySQL.setDb(database);
mySQL.setPort(3306); // default: 3306
```

### Creating a table

Creates a table with the default Syntax "CREATE TABLE IF NOT EXISTS".

#### Example

```java
mysql.table("`table` (`column1` TEXT NOT NULL, `column2` TEXT NOT NULL)");
// you don't need CREATE TABLE IF NOT EXISTS, because its there default
// you don't have to use TEXT NOT NULL. But you can use TEXT for everything
```

### Getting Data

Getting data from a MySQL table.
If you don't need a filter or where just put a empty string or write null.

#### Example

```java
// USAGE: MySQL#getData(from, filter, where, Consumer)

mySQL.getData("from", "*", "`owner` = `XNonymous`", data -> {
   for (Row object : data.getObjects()) {
        // do whatever you want
        String owner = (String) object.get("owner");
   }
});
mySQL.getData("from", "*", "", data -> {});
mySQL.getData("from", "", "", data -> {});
```

### Inserting Data

Insert data in a table. 

#### Example

```java
// USAGE: MySQL#insertData(table, values, data...)

mySQL.insertData("table", "`name`, `nameID`", "XNonymous", "#125432");
```

### Deleting Data

Delete data from a table.

#### Example

```java
// USAGE: mySQL.delete(table, value, column) OR mySQL.delete(table, Delete.of(value, column)...)

mySQL.delete("table", "user", "XNonymous");
mySQL.delete("table", Delete.of("user", "XNonymous"), Delete.of("userID", "#125432"));
```
