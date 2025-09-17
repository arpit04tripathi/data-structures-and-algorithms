#!/usr/bin/env bash

separator_start() {
  echo '================================================================================= v';
}

separator_end() {
  echo '================================================================================= ^';
}

banner() {
  separator
  echo $1
  separator
}

separator_start
echo 'command > git fetch --all -p; git pull; git status;'
git fetch --all -p; git pull; git status;

echo 'command > git merge origin/main'
git merge origin/main;
separator_end
