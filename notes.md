# Notes on Contract Generation

### Assumptions
* The first property defined in resource schemas must be their id. 
* And the property must have the same name as the one used to identify the resource in paths. E.g.
  pet/{petId} -> components/schemas/Pet/petId. 
  