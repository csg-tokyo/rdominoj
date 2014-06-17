The ReactiveDominoJ compiler
--------------------
Copyright (c) 2013-, YungYu Zhuang. All rights reserved.

ReactiveDominoJ is a practical implementation of an expand event system
supporting reactive programming.  This project is an extension to the DominoJ compiler.
For the publications and binary distribution please visit our project webpage:
  http://www.csg.ci.i.u-tokyo.ac.jp/projects/rdominoj/

The source code of this project is licensed under the modified BSD License
(please see the LICENSE file for the full text).


build steps:
  1. checkout ReactiveDominoJ from GitHub.
     "git clone https://github.com/yungyu/rdominoj.git rdominoj"
  2. checkout DominoJ from GitHub.
     "git clone https://github.com/yungyu/dominoj.git dominoj"
  3. checkout JastAddJ from its SVN repository.
     "svn checkout http://svn.cs.lth.se/svn/jastadd-oxford/projects/branches/JastAddJ-stable/ jastaddj"
  4. copy dominoj runtime in DominoJ to ReactiveDominoJ
     "cp -r dominoj/dominoj rdominoj/"
  5. build ReactiveDominoJ using ant
     "cd rdominoj && ant"

create jar files:
  1. "ant jar" for building DominoJCompiler.jar and dominoj.jar
  2. "ant source" for building dominoj-compiler-src.jar

examples:
  1. "cd examples && ant"
  2. "ant run" for testing

testcases:
  1. "cd testcases && ant"
  2. "ant run" for testing

to compile a source file written in ReactiveDominoJ:
     "java -jar ReactiveDominoJCompiler.jar MyClass.java"
  or:
     "java -cp ~/devel/ReactiveDominoJ JavaCompiler MyClass.java"
  or let rdominojc could be found in your $PATH and then:
     "rdominojc MyClass.java"

the execution is the same as other Java programs.
     "java -cp dominoj.jar:. MyClass"
