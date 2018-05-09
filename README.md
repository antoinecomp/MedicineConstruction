# MedicineConstruction

Professor Jurisica constructed a benchmark suite of organic synthesis problems collected from undergraduate organic chemistry exams from MIT undergraduate exams. 

Jurisica tried an AND/OR graph search by developing the first chemistry solver to use proof-number search. I am trying to implement an equivalent using Nested Monte Carlo method.

Documentation about the method he used can be found on the website page related to his paper [Construction of New Medicines via Game Proof Search](http://www.cs.toronto.edu/~aheifets/ChemicalPlanning/)

Documentation about the Nested Monte Carlo method can be found on the first page of Tristan Cazenave's paper on [Nested Monte-Carlo Search](http://www.lamsade.dauphine.fr/~cazenave/papers/nested.pdf)

# How to launch the algorithms

You can test the algorithm launching the scripts which will do the difference between the log and the expected solution which Jurisica stored in a text file. You may need to modify the scripts to launch the exercises you want to try.

## How to test Proof Number Search

To launch Proof Number Search's algorithm launch `run_caos_engine.sh` from your terminal in the `src/test` folder.

## How to test Nested Monte Carlo (under construction)

To launch Nested Monte Carlo's algorithm launch `run_nmc_engine.sh` from your terminal in the `src/test` folder.

## Remarks

It seems there is a problem as far as the `diff` command prints the whole solution text as far as the log from our own algorithm seems to be empty as you may see in `out/rxndebug/` and the number of the exercise you tried
An error message appear in the error file :

```
Error: Could not find or load main class caos.aaai.CaosNMCEngine
```
