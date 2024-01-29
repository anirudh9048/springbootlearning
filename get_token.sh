curl -X POST -H 'Content-Type: application/x-www-form-urlencoded' -H 'Accept: application/json' -k \
  -d 'grant_type=client_credentials' \
  -d 'scope=employer_access' \
  -d 'client_id=cc7b0ad3fb6438e6726dffa4e748625d6e9dd58e0782cd6b67dac2c33d9e3cec' \
  -d 'client_secret=Ka2dh2yQHQNy3WLRPj4sYgpIK0sZvRirE6l6C5SrsRSk2qC9DGkG74XTBW2LNaE0' \
  https://apis.indeed.com/oauth/v2/tokens > token