#!/usr/bin/env bash

set -xe

docker run -t --rm -v "$(pwd)":/katalon/katalon/source katalonstudio/katalon katalon-execute.sh -browserType="Firefox" -testSuitePath="Test Suites/TS_RegressionTest" -propertiesFile="/tmp/source/console.properties"