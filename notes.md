# Notes on Contract Generation

### Assumptions
* The first property defined in resource schemas must be their id. 
* And the property must have the same name as the one used to identify the resource in paths. E.g.
  pet/{petId} -> components/schemas/Pet/petId. 
* The generator will use '?' as a placeholder so the user knows it couldn't infer glacier predicates
  for that operation. The tester will fail if these placeholders are not replaced. 
  For simplicity, we replaced them by 'T'. 