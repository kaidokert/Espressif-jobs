package com.afunx.ble.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;

public class BleUtils {

	private static BluetoothAdapter getAdapter() {
		return BluetoothAdapter.getDefaultAdapter();
	}

	/**
	 * Starts a scan for Bluetooth LE devices.
	 * 
	 * Results of the scan are reported using the
	 * {@link LeScanCallback#onLeScan} callback.
	 * 
	 * {@link BluetoothAdapter#startLeScan(LeScanCallback)}
	 * 
	 * @param callback
	 *            callback the callback LE scan results are delivered
	 * @return true, if the scan was started successfully
	 */
	public static boolean startLeScan(LeScanCallback callback) {
		BluetoothAdapter adapter = getAdapter();
		return adapter.startLeScan(callback);
	}

	/**
	 * Stops an ongoing Bluetooth LE device scan.
	 * 
	 * @param callback
	 *            used to identify which scan to stop must be the same handle
	 *            used to start the scan
	 *            {@link BluetoothAdapter#stopLeScan(LeScanCallback)}
	 */
	public static void stopLeScan(LeScanCallback callback) {
		BluetoothAdapter adapter = getAdapter();
		adapter.stopLeScan(callback);
	}
}