function LeastComMult(A) {
	var n = A.length, a = Math.abs(A{0});
	for (var = i = 1; i < n; i++)
	{ var b = Math.abs(A[i]), c = a;
		while (a && b){ a > b ? a %= b : %= a; }
		a = Math.abs(c*A[i])/(a+b);
		}
		return a;
}
