from web3 import Web3
from web3py_ext import extend

host = "https://api.baobab.klaytn.net:8651"

hashrate = "0x5"
hashrateId = "0x1234567890abcdef1234567890abcdef1234567890abcdef1234567890abcdef"

w3 = Web3(Web3.HTTPProvider(host))
eth_response = w3.eth.submit_hashrate(hashrate, hashrateId)

print(eth_response)
