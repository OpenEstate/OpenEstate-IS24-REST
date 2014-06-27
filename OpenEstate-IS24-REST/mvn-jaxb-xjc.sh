#!/bin/bash

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export LANG=en

cd $PROJECT_DIR
rm -f jaxb.timestamp
rm -f src/main/java/com/openindex/openestate/impl/is24/xml/*.*
$MVN mvn jaxb2:xjc
