#!/bin/bash

MVN=mvn
PROJECT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
export LANG=en
set -e

cd $PROJECT_DIR
./git-submodule-update.sh
$MVN clean install javadoc:aggregate
$MVN --non-recursive assembly:single
