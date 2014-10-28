#!/bin/bash

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export LANG=en

cd $PROJECT_DIR
$MVN findbugs:check findbugs:gui
