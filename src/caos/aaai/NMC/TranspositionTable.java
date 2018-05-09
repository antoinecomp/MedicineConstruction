package caos.aaai.NMC;

import java.util.HashMap;

import caos.aaai.State;

// TODO: Is this class really necessary?
public class TranspositionTable  {
	private HashMap<State, PNNode> table;
	public TranspositionTable() {
		table = new HashMap<State, PNNode>();
	}
	// don't perfectly understand table.get(s)
	public NMCNode getNode(State s) {
		NMCode n = table.get(s);
		if (n==null) {
			n = new OrNode(s);
			table.put(s, n);
		}
		return n;
	}

}
