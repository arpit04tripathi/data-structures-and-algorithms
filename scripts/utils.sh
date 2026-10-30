#!/usr/bin/env bash

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

# Run SDKMAN commands in scripts
export SDKMAN_DIR="$HOME/.sdkman"
if [[ -s "$SDKMAN_DIR/bin/sdkman-init.sh" ]]; then
    source "$SDKMAN_DIR/bin/sdkman-init.sh"
else
    echo "Error: SDKMAN! not found at $SDKMAN_DIR"
    exit 1
fi
sdk current
