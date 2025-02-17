-- Tested against Docker Toolbox.
-- Make sure the corresponding Windows drives/directories has been added to VirtualBox's shared directories https://docs.docker.com/toolbox/toolbox_install_windows/#optional-add-shared-directories

@echo on

set currentdir=%cd::\=/%
set currentdir=%currentdir:\=/%

docker run -t --rm -v "/%currentdir%:/tmp/source" -w /tmp/source katalonstudio/katalon katalon-execute.sh -browserType="Chrome" -testSuitePath="Test Suites/your_site/login_user_test_suite" -propertiesFile="/tmp/source/console.properties"
