The ReactiveDominoJ compiler
--------------------
Copyright (c) 2013-, YungYu Zhuang. All rights reserved.

ReactiveDominoJ is a practical implementation of an expand event system
supporting reactive programming.  This project is an extension to the DominoJ compiler.
For the publications and binary distribution please visit our project webpage:

  http://www.csg.ci.i.u-tokyo.ac.jp/projects/rdominoj/

The source code of this project is licensed under the modified BSD License
(please see the LICENSE file for the full text).


### build steps

* checkout ReactiveDominoJ from GitHub.

  `git clone https://github.com/yungyu/rdominoj.git rdominoj`

* checkout DominoJ from GitHub.

  `git clone https://github.com/yungyu/dominoj.git dominoj`

* checkout JastAddJ from its SVN repository.

  `svn checkout http://svn.cs.lth.se/svn/jastadd-oxford/projects/branches/JastAddJ-stable/ jastaddj`

* copy dominoj runtime in DominoJ to ReactiveDominoJ.

  `cp -r dominoj/dominoj rdominoj/`

* build ReactiveDominoJ using ant.

  `cd rdominoj && ant`

### create jar files

* `ant jar` for building DominoJCompiler.jar and dominoj.jar.

* `ant source` for building dominoj-compiler-src.jar.

### examples

* `cd examples && ant` for building.
 
* `ant run` for testing.

### testcases

* `cd testcases && ant` for building.

* `ant run` for testing.

### to compile a source file written in ReactiveDominoJ

  `java -jar ReactiveDominoJCompiler.jar MyClass.java`

  or

  `java -cp ~/devel/ReactiveDominoJ JavaCompiler MyClass.java`

  or let rdominojc could be found in your $PATH and then

  `rdominojc MyClass.java`

### the execution is the same as other Java programs

  `java -cp dominoj.jar:. MyClass`
