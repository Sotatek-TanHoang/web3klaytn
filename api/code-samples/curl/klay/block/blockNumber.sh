curl -X 'POST' \
  'https://api.baobab.klaytn.net:8651/klay/blockNumber' \
  -H 'accept: application/json' \
  -H 'Content-Type: application/json' \
  -d '{
  "method": "klay_blockNumber",
  "id": 1,
  "jsonrpc": "2.0",
  "params": []
}'
