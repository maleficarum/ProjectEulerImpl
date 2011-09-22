package mx.angellore.projecteulerimpl

def total = 0
(1..999).findAll { i -> ((i % 3 == 0) || (1 % 5 == 0))}.each { total+= it}
println total