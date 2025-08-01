import React from 'react';
import CohortDetails from './CohortDetails';

const dummyCohorts = [
  { name: 'Cohort 1', status: 'ongoing', startDate: '2025-07-01', endDate: '2025-12-01' },
  { name: 'Cohort 2', status: 'completed', startDate: '2025-01-01', endDate: '2025-06-30' }
];

function App() {
  return (
    <div className="App">
      <h2>Cohort Dashboard</h2>
      {dummyCohorts.map((cohort, idx) => (
        <CohortDetails key={idx} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
