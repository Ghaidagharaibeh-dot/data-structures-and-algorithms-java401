# Graphs

A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.

# Challenge
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

- add vertex

- add edge

- get vertices

- get neighbors

- size

# Approach and Efficiency

1) add vertex

- Time: O(1)
- Space: O(1)

2) add edge

- Time: O(1)
- Space: O(1)

3) get Vertices

- Time: O(1)
- Space: O(n) ---> n: is the number of Vertices

4) get neighbors

- Time: O(1)
- Space: O(n) ---> n: is the number of neighbor Vertices
- 
5) size

- Time: O(n) n: is the number of neighbor Vertices
- Space: O(1)

## API
1) ```addVertex(String data)```: This method adds a vertex to the graph and it accepts String parameter for the value of the vertex.
2) ```addEdge(String data1, String data2)```: This method adds a new edge between two Vertices in the graph and it accepts two String parameters, The parameters are vertices that will add the edge between each other.
3) ```getVertices()```: This method returns all of the nodes in the graph as a collection.
4) ```getNeighbors(String data)```: This method returns all the connections of the required vertex as a list.
5) ```size()```: This method to get the number of all vertices in the graph.





