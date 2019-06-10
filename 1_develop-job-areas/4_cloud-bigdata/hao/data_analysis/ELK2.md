### ELK2
```

```
#### Basic Concepts
- Cluster & Node
- Index
- Type
- Document
- Shards & Replicas

- Rest API
```
GET /_cat/health?v
GET /_cat/nodes?v

GET /_cat/indices?v
```

- Common
```
PUT /customer?pretty
GET /_cat/indices?v

PUT /customer/_doc/1?pretty
{
  "name": "John Doe"
}

GET /customer/_doc/1?pretty

PUT /customer/_doc/1?pretty
{
  "name": "Jane Doe"
}

DELETE /customer?pretty
GET /_cat/indices?v

POST /customer/_doc?pretty
{
  "name": "Jane Doe"
}
POST /customer/_update/1?pretty
{
  "doc": { "name": "Jane Doe" }
}

DELETE /customer/_doc/2?pretty
```

- Search API
```
GET /bank/_search?q=*&sort=account_number:asc&pretty
GET /bank/_search
{
  "query": { "match_all": {} },
  "sort": [
    { "account_number": "asc" }
  ]
}

GET /bank/_search
{
  "query": { "match_all": {} },
  "_source": ["account_number", "balance"]
}

GET /bank/_search
{
  "query": { "match": { "account_number": 20 } }
}

GET /bank/_search
{
  "query": { "match_phrase": { "address": "mill lane" } }
}

bool must => and
bool should => or
bool must_not => nor
```

- Filters
```
GET /bank/_search
{
  "query": {
    "bool": {
      "must": { "match_all": {} },
      "filter": {
        "range": {
          "balance": {
            "gte": 20000,
            "lte": 30000
          }
        }
      }
    }
  }
}
```

- Aggregations Complex
```
GET /bank/_search
{
  "size": 0,
  "aggs": {
    "group_by_state": {
      "terms": {
        "field": "state.keyword"
      }
    }
  }
}

SELECT state, COUNT(*) FROM bank GROUP BY state ORDER BY COUNT(*) DESC LIMIT 10;
```

#### Set up Elasticsearch
- configuration management tools
```
Puppet
Chef
Ansible
```
- Configuring Elasticsearch
```
1.elasticsearch.yml
	node.name: ${HOSTNAME}
	path:
		data: /var/lib/elasticsearch
		logs: /var/log/elasticsearch
	cluster.name: my-es-cluster
	network.host: ${ES_NETWORK_HOST}

2.jvm.options
	-Xms2g
	-Xmx2g
	8:-Xmx2g 	jdk8
	8-:-Xmx2g   jdk8+
	8-9:-Xmx2g  jdk8-9
	ES_JAVA_OPTS="-Xms2g -Xmx2g" ./bin/elasticsearch
	ES_JAVA_OPTS="-Xms4000m -Xmx4000m" ./bin/elasticsearch
	
	-XX:HeapDumpPath=...
	-XX:ErrorFile=...

3.log4j2.properties
	logger.transport.name = org.elasticsearch.transport
	logger.transport.level = trace
	
```
- 



























