# Jiang Weichen - Project Portfolio Page

This is a student project for a university software development course and I am one of the contributors to `MediVault`.

## Summary of Contributions

Given below are my contributions to the project.

Code contributed: more than 600 lines of
code. [[RepoSense](https://nus-cs2113-ay2122s1.github.io/tp-dashboard/?search=&sort=groupTitle&sortWithin=title&timeframe=commit&mergegroup=&groupSelect=groupByRepos&breakdown=true&checkedFileTypes=docs~functional-code~test-code~other&since=2021-09-25&tabOpen=true&tabType=authorship&tabAuthor=jiangweichen835&tabRepo=AY2122S1-CS2113T-T10-1%2Ftp%5Bmaster%5D&authorshipIsMergeGroup=false&authorshipFileTypes=docs~functional-code~test-code&authorshipIsBinaryFileTypeChecked=false)]
### Features

#### v1.0:

* Implemented listing by medicine name and description to `liststock` command.
  * Functionality: Users are able to search for medicine with one command.
  * Justification: Users will be able to search for medicine by name or description.
  * Pull request: [[#26](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/26)]

#### v2.0:

* Implemented `addorder` command.
  * Functionality: Users are able to add order for medicine with one command.
  * Justification: Users will be able to add medication's name, quantity and order date using a single command.
  * Pull request: [[#139](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/139)]

### Enhancements to Existing Features

* Included JUnit tests for:
  * `StockValidator` class
  * `MedicineValidator` class
  * Pull request: [[#91](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/91)]
  
* Added functionality to `addorder` command to set order date as optional and limit order quantity
  * Functionality: User will not be able to add order if total existing quantity in stock and order quantity exceeds maximum quantity.
  Order date will be set as the date when user placed the order if order parameter not given. 
  * Pull request: [[#172](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/172)]

### Documentation

* [User Guide](../UserGuide.md)
  * Added documentations for `liststock` and `addorder` commands
  * Pull request: [[#99](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/99)
  , [#188](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/188)]

* [Developer Guide](../DeveloperGuide.md)
  * Implementation 
    * `addorder` sequence diagram and detailed explanation.
    * Pull request: [[#174](https://github.com/AY2122S1-CS2113T-T10-1/tp/pull/174)]