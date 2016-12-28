	var i = 2;
	var j = 2;
	var k = 2;
	var a = 2;
	var b = 2;

	function O_plus() {

		if (i == 5) {
			return;
		}
		i++;
		var name = "o_" + i;

		document.getElementById(name).style.display = 'block';
	}

	function O_minus() {
		if (i == 2) {
			return;
		}
		var name = "o_" + i;

		document.getElementById(name).style.display = 'none';

		i--;
	}

	function E_plus() {

		if (j == 5) {
			return;
		}
		j++;
		var name = "e_" + j;

		document.getElementById(name).style.display = 'block';
	}

	function E_minus() {
		if (j == 2) {
			return;
		}
		var name = "e_" + j;

		document.getElementById(name).style.display = 'none';

		j--;
	}

	function A_plus() {

		if (k == 5) {
			return;
		}
		k++;
		var name = "a_" + k;

		document.getElementById(name).style.display = 'block';
	}

	function A_minus() {
		if (k == 2) {
			return;
		}
		var name = "a_" + k;

		document.getElementById(name).style.display = 'none';

		k--;
	}

	function S_plus() {

		if (a == 5) {
			return;
		}
		a++;
		var name = "s_" + a;

		document.getElementById(name).style.display = 'block';
	}

	function S_minus() {
		if (a == 2) {
			return;
		}
		var name = "s_" + a;

		document.getElementById(name).style.display = 'none';

		a--;
	}

	function V_plus() {

		if (b == 5) {
			return;
		}
		b++;
		var name = "v_" + b;

		document.getElementById(name).style.display = 'block';
	}

	function V_minus() {
		if (b == 2) {
			return;
		}
		var name = "v_" + b;

		document.getElementById(name).style.display = 'none';

		b--;
	}