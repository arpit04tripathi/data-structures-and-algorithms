#!/usr/bin/env bash

echo =========================================================
echo Running $0 with $# arguments
echo [processID] $$
echo [arguments] $@
echo =========================================================

NVM_VERSION=''

separator_start() {
  echo '================================================================================= v';
}

separator_end() {
  echo '================================================================================= ^';
}

banner() {
  separator_start
  echo $1
  separator_end
}

case $1 in
  git)
    banner "git fetch --all -p; git pull; git status;"
    git fetch --all -p; git pull; git status;
    banner "git merge origin/main;"
    git merge origin/main;
    # git push;
    ;;
  install)
    banner "update sdk and use java version in .sdkmanrc"
    sdk selfupdate
    sdk env install
    sdk env
    sdk current
    ;;
  list)
    banner "list projects"
    ./gradlew projects -q
    ;;
  current)
    banner "sdk current"
    sdk current;
    ;;
  *)
    echo "  git - sync latest from main"
    echo "  install - update sdk and use java version in .sdkmanrc"
    ;;
esac

echo
