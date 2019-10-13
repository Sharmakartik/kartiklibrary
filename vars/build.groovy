#!/usr/bin/groovy

import scr.Shell.*

def call(message='package'){
    def h= new Shell(this)
    //h.mvn'clean'
    bat"mvn ${message}"
 
    echo "build from script"
    
 }
